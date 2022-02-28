package springprojet.springprojet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Reference {
    @Id
    private int idR;
    public String objet;
    public String nomE;
    public Date dateR;
    private float montant;


}
