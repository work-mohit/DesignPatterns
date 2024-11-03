package org.mohjo.template;

public class TransferMoneyTask extends Task {

//    public AuditTrail auditTrail;
//    public TransferMoneyTask(AuditTrail auditTrail) {
//        super(auditTrail);
//    }


//    private AuditTrail auditTrail;
//
//    public TransferMoneyTask(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }
//    public void execute(){
//        auditTrail.record();
//
//        System.out.println("Transfer Money!");
//    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money!");
    }
}
