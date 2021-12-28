package view.tm;

public class ProgramTm {
    private String pid;
    private String program;
    private String duration;
    private double fee;

    public ProgramTm() {
    }

    public ProgramTm(String pid, String program, String duration, double fee) {
        this.pid = pid;
        this.program = program;
        this.duration = duration;
        this.fee = fee;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "ProgramTm{" +
                "pid='" + pid + '\'' +
                ", program='" + program + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                '}';
    }
}
