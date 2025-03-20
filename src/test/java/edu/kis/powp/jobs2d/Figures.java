package edu.kis.powp.jobs2d;

public enum Figures {
    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2"),
    FIGURE_JANE("Figures Jane"),
    FIGURE_CUSTOM("Figures Custom 1");

    private final String figureName;

    Figures(String figureName){
        this.figureName = figureName;
    }

    public String getCommand(){
        return figureName;
    }
}

