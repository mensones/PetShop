
package senai.santos.java.modelo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.swing.text.html.parser.Entity;


//@Entity(name="agenda")
public class AgendaEntidade {

    @Id
    @Column(nullable=false,name="ID")
    private int id; 
    @Column(nullable=false,name="CLIENTE")
    private String cliente;
    private String data; 
    private String hora;
    private String pet;
    private String telefone;
    private String servico;
    private double valor; 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AgendaEntidade other = (AgendaEntidade) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public AgendaEntidade(String data, String cliente, String hora, String pet, String telefone, String servico, double valor) {
        this.data = data;
        this.cliente = cliente;
        this.hora = hora;
        this.pet = pet;
        this.telefone = telefone;
        this.servico = servico;
        this.valor = valor;
    }

    public AgendaEntidade() {
        
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
    
    
    
}
