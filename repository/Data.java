package repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Data(LocalDate dataInicial, LocalDate dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(CharSequence dataInicial) {
        this.dataInicial = LocalDate.parse(dataInicial, dtf);
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    } 
}