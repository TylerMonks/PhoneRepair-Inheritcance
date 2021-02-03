package devicerepair;

public class Device {

    protected String IdentificationCode;
    protected String MakeandModel;
    protected String Owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected int Priority;

    public Device(String IdentificationCode, String MakeandModel, String Owner, String ProblemDescription, String RepairNotes, int Priority) {
        this.IdentificationCode = IdentificationCode;
        this.MakeandModel = MakeandModel;
        this.Owner = Owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
        this.Priority = Priority;

    }

    Device(String string, String lenovo_3, String julie, String smashed_screen, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public String getMakeandModel() {
        return MakeandModel;
    }

    public void setMakeandModel(String MakeandModel) {
        this.MakeandModel = MakeandModel;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setRepairNotes(String RepairNotes) {
        this.RepairNotes = RepairNotes;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

}
