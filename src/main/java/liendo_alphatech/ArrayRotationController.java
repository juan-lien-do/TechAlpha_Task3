package liendo_alphatech;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayRotationController {
    private ArrayRotationIO ario;
    private ArrayRotationService ars;
    private Long[] initialNumberArray;
    private Long[] finalNumberArray;
    private Integer dFactor;

    public ArrayRotationController(){
        // set ARIO
        ario = new ArrayRotationIO(this);
        // set ARS
        ars = new ArrayRotationService();
        // start routine
        routine();
    }

    public void routine(){
        // call input output class and set initialNumberArray (from rdio)
        ario.askForInitialArray();
        // call service and set finalNumberArray
        this.finalNumberArray = ars.rotateArray(this.initialNumberArray, this.dFactor);
        // call input output class and show final number array
        ario.showArray(this.finalNumberArray);
        // end of the use case
    }
}
