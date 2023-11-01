/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wilmer de Mata
 */
@Entity
@Table(name = "ordenes")
public class Ordenes implements Serializable {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
        private Long idOrden;
        @Column(name = "cliente_id")
    private String ClienteId;
        @Column(name = "fecha")
    private String fecha;
        @Column(name = "total")
    private String total;
    /**
     * @return the idOrden
     */
    public Long getIdOrden() {
        return idOrden;
    }

    /**
     * @param idOrden the idOrden to set
     */
    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    /**
     * @return the ClienteId
     */
    public String getClienteId() {
        return ClienteId;
    }

    /**
     * @param ClienteId the ClienteId to set
     */
    public void setClienteId(String ClienteId) {
        this.ClienteId = ClienteId;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }
    
   
    
}
