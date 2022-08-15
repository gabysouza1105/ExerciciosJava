package ExercíciosPOO.Ex16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import javax.swing.text.MaskFormatter;

public class Compromisso {
    private String nome;
    private LocalDate data;
    private String participante;
    private String telefone;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

    public Compromisso(String nome, String strData, String participante, String telefone) {
        setNome(nome);
        setData(strData);
        setParticipante(participante);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data.format(formatter);
    }

    public void setData(String strData) {
        LocalDate data = LocalDate.parse(strData, formatter);
        this.data = data;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String formatarTelefone(String formato) {
        try {
            MaskFormatter formatter = new MaskFormatter(formato);
            formatter.setValueContainsLiteralCharacters(false);
            return formatter.valueToString(telefone);
        } catch (Exception e) {
            return telefone;
        }
    }

    public String getTelefone() {
        try {
            if (telefone != null) {
                MaskFormatter formatter = new MaskFormatter("(##) #####-####");
                formatter.setValueContainsLiteralCharacters(false);
                return formatter.valueToString(telefone);
            } else {
                return "";
            }
        } catch (Exception e) {
            return telefone;
        }
    }

    public void setTelefone(String telefone) {
        if (telefone.toCharArray().length == 11) {
            this.telefone = telefone;
        } 
    }

}
