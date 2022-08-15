package Interfaces;

import Enums.Status;

public interface UserMidia {
    Status getStatus();
    void setStatus(Status status);
    double getNotaUsuario();
    void setNotaUsuario(double notaUsuario);
    int getProgesso();
    void setProgesso(int progesso);
}
