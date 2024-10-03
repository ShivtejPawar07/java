class mobileuser {
    public static void main(String[] args) {
        sim jioSim = new jio();  // Create a jio sim object
        mobile vivo = new mobile(jioSim);  // Pass the sim object to the mobile
    }
}

class mobile {
    // Constructor to accept a sim object
    public mobile(sim s) {
        insertsim(s);  // Pass the sim to the insertsim method
    }

    void insertsim(sim s) {
        s.calling();
        s.sms();
    }
}

interface sim {
    void calling();
    void sms();
}

class jio implements sim {
    public void calling() {
        System.out.println("Jio is calling...");
    }

    public void sms() {
        System.out.println("Jio is sending an SMS...");
    }
}

class airtel implements sim {
    public void calling() {
        System.out.println("Airtel is calling...");
    }

    public void sms() {
        System.out.println("Airtel is sending an SMS...");
    }
}

class vi implements sim {
    public void calling() {
        System.out.println("VI is calling...");
    }

    public void sms() {
        System.out.println("VI is sending an SMS...");
    }
}
