/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualbelimotor;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ade
 */
@Entity
public class motor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nama;
    private String alamat;
    private String NoTelpon;
    private String Merkmotor;
    private String Iduser;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != 1 ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof motor)) {
            return false;
        }
        motor other = (motor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jualbelimotor.motor[ id=" + id + " ]";
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String b) {
        this.nama = b;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String c) {
        this.alamat = c;
    }
    public String getNoTelpon() {
        return NoTelpon;
    }
    public void setNoTelpon(String d) {
        this.NoTelpon = d;
    }
    public String getMerkmotor() {
        return Merkmotor;
    }
    public void setMerkmotor(String e) {
        this.Merkmotor = e;
    }
    public String getIduser() {
        return Iduser;
    }
    public void setIduser(String a) {
        this.Iduser = a;
    }
}
