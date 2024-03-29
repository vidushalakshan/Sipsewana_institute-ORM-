package entity;

import dto.ProgramDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "program")
public class Program extends ProgramDto implements SuperEntity {
    @Id
    private String pid;
    private String program;
    private String duration;
    private double fee;

    public Program() {
    }

    public Program(String pid, String program, String duration, double fee) {
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
        return "Program{" +
                "pid='" + pid + '\'' +
                ", program='" + program + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                '}';
    }
}
