package Behavioral.ChainOfResponsibility;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();
}
