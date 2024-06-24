package shool.hei.Pointage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pointage {
    private Employe employe;
    private LocalDate date;
    private int heuresNormales;
    private int heuresSupplementaires;
    private int heuresMajorées;
}
