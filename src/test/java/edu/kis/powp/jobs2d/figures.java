package edu.kis.powp.jobs2d;

public enum figures {
    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2");

    private final String figureName;

    figures(String figureName){
        this.figureName = figureName;
    }

    public String getCommand(){
        return figureName;
    }
}

