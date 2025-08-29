class Person {
    String n;

    Person(String n) {
        this.n = n;
    }

    String info() {
        return "Name: " + n;
    }
}

class Record {
    String holder;
    String diag;

    Record(String holder, String diag) {
        this.holder = holder;
        this.diag = diag;
    }

    void show() {
        System.out.println("Record Holder: " + holder);
        System.out.println("Diagnosis: " + diag);
    }
}

class RxRecord extends Record {
    String meds;

    RxRecord(String holder, String diag, String meds) {
        super(holder, diag);
        this.meds = meds;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Medications: " + meds);
    }
}

class SurgRecord extends Record {
    String type;

    SurgRecord(String holder, String diag, String type) {
        super(holder, diag);
        this.type = type;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Surgery Type: " + type);
    }
}

class Patient extends Person {
    String id;
    Record rec;

    Patient(String n, String id, Record rec) {
        super(n);
        this.id = id;
        this.rec = rec;
    }

    @Override
    String info() {
        return super.info() + ", Patient ID: " + id;
    }

    void showRec() {
        rec.show();
    }
}

class InPatient extends Patient {
    String room;

    InPatient(String n, String id, Record rec, String room) {
        super(n, id, rec);
        this.room = room;
    }

    @Override
    String info() {
        return super.info() + ", Room Number: " + room;
    }
}

public class Inheritprc {
    public static void main(String[] args) {
        Record r = new RxRecord("Rudra", "Flu", "Paracetamol, Rest");
        InPatient p = new InPatient("Rudra", "Xyz123", r, "Rn32");

        System.out.println(p.info());
        p.showRec();
    }
}
