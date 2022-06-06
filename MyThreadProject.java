//project for understanding multithreading


class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run () {
        int i = 1;
        while(true) {
            this.c.produceItem(i);
            
            try {
              Thread.sleep(1000);
            }catch (Exception e) {

            }  
            i++;
        }
    }
}

class Consumer extends Thread {
    Company c;

    Consumer (Company c) {
        this.c = c;

    }

    public void run() {
        while(true) {
            this.c.comsumeItem();

            try {
                Thread.sleep(1000);
            }catch(Exception e) {

            }
            
        }
    }
}
 class Company {
     
    int n;
    boolean f = false;
    //
    synchronized public void produceItem(int n) {

        if(f) {
            try{
                wait();
            }catch(Exception e) {
                
            }
            
        }
        this.n = n;
        System.out.println("Produced :" + this.n);
        f = true;
        notify();
    }

    synchronized public int comsumeItem () {

        if(!f) {
            try{
                wait();
            }catch(Exception e) {

            }
            
        }
        System.out.println("Comsumed :" + this.n);
        f = false;
        notify();
        return this.n;
    }
    
}

class MyThreadProject {
    
    public static void main(String[] args) {
    Company company = new Company();

    Producer producer = new Producer(company);
    Consumer consumer = new Consumer(company);

    producer.start();
    consumer.start();
}
}

