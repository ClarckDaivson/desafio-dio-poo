import java.time.LocalDate;

public class mentoria {
    String titulo;
    String desccricao;
    LocalDate data;

    public mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesccricao() {
        return desccricao;
    }

    public void setDesccricao(String desccricao) {
        this.desccricao = desccricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "titulo='" + titulo + '\'' +
                ", desccricao='" + desccricao + '\'' +
                ", data=" + data +
                '}';
    }
}
