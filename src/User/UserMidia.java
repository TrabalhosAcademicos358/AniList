package User;

import Enums.Status;

public abstract class UserMidia {
    private Status status;
    private double notaUsuario;
    private int progesso;

    public UserMidia(Status status, double notaUsuario, int progesso) {
        this.status = status;
        this.notaUsuario = notaUsuario;
        this.progesso = progesso;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getNotaUsuario() {
        return notaUsuario;
    }

    public void setNotaUsuario(double notaUsuario) {
        this.notaUsuario = notaUsuario;
    }

    public int getProgesso() {
        return progesso;
    }

    public void setProgesso(int progesso) {
        this.progesso = progesso;
    }
}