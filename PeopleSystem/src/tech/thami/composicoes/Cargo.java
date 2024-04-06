package tech.thami.composicoes;

public enum Cargo {
    ESTAGIARIO, TRAINEE, JUNIOR, PLENO, SENIOR, ESPEC;

    public void escolherCargo() {
        switch (this) {
            case ESTAGIARIO:
                System.out.println("Cargo Estagiário.");
                break;
            case TRAINEE:
                System.out.println("Cargo Trainee.");
                break;
            case JUNIOR:
                System.out.println("Cargo Júnior.");
                break;
            case PLENO:
                System.out.println("Cargo Pleno.");
                break;
            case SENIOR:
                System.out.println("Cargo Sênior.");
                break;
            case ESPEC:
                System.out.println("Cargo Especialista.");
                break;
            default:
                System.out.println("Cargo não reconhecido.");
        }
    }
}