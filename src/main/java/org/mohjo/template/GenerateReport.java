package org.mohjo.template;

public class GenerateReport extends Task{

    // for this class we have to do the same thing that we did in transfer money class
//    private AuditTrail auditTrail;
//    public GenerateReport(AuditTrail auditTrail) {

//        this.auditTrail = auditTrail;
//    }
//
//    public void generate(){
//        auditTrail.record();
//        System.out.println("Generate Report Task!");
//    }
//    public GenerateReport(AuditTrail auditTrail) {
//        super(auditTrail);
//    }
    @Override
    protected void doExecute() {
        System.out.println("Generate Report Task!");
    }

}
