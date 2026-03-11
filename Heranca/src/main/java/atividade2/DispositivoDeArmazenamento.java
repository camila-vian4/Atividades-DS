package atividade2;

public class DispositivoDeArmazenamento extends Produto {
    private String capacidadeArmazenamento;
    private String tipoConexao;

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidadeArmazenamento, String tipoConexao) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoConexao = tipoConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento{" +
                "capacidadeArmazenamento='" + capacidadeArmazenamento + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
