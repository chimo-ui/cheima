package springprojet.springprojet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PersonneP implements Candidat{
    @Id
    @GeneratedValue
    private int idP;
    private String nom;
    private String prenom;
    private String adresse;
    private String Tel;
    private String mail;
    @OneToMany(targetEntity = Reference.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "p_fk", referencedColumnName = "idP")

    private List<Reference> references;



    @Override
    public void setReference(Reference r) {

    }

    @Override
    public Reference getReference() {
        return null;
    }
}
