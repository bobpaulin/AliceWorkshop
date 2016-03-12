// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.MaleAdultHairMohawk;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitMaternityComfy;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.AdultPersonResource;
import static org.lgna.common.ThreadUtilities.doTogether;
// </editor-fold>

class Scene extends SScene {

    public Scene() {
        super();
    }

    private void performCustomSetup() {
    }

    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    public void myFirstMethod() {
        for (Integer indexA = 0; indexA < 3; indexA++) {
            doTogether(() -> {
                this.adultPerson.getRightShoulder().turn(TurnDirection.BACKWARD, 0.5);
            }, () -> {
                this.adultPerson.getLeftShoulder().turn(TurnDirection.BACKWARD, 0.5);
            }, () -> {
                this.adultPerson.getRightHip().turn(TurnDirection.RIGHT, 0.125);
            }, () -> {
                this.adultPerson.getLeftHip().turn(TurnDirection.LEFT, 0.125);
            });
            doTogether(() -> {
                this.adultPerson.getRightShoulder().turn(TurnDirection.FORWARD, 0.5);
            }, () -> {
                this.adultPerson.getLeftShoulder().turn(TurnDirection.FORWARD, 0.5);
            }, () -> {
                this.adultPerson.getRightHip().turn(TurnDirection.LEFT, 0.125);
            }, () -> {
                this.adultPerson.getLeftHip().turn(TurnDirection.RIGHT, 0.125);
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="boiler plate code: handleActiveChanged">

    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="boiler plate code: performGeneratedSetUp">
    private void performGeneratedSetUp() {//DO NOT EDIT
//DO NOT EDIT
//DO NOT EDIT
//
//This code is automatically generated.  Any work you perform in this method will be overwritten.
//
//DO NOT EDIT
//DO NOT EDIT
//DO NOT EDIT
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(-0.051, 1.56, -3.41));
        this.adultPerson.setPaint(Color.WHITE);
        this.adultPerson.setOpacity(1.0);
        this.adultPerson.setName("adultPerson");
        this.adultPerson.setVehicle(this);
        this.adultPerson.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.adultPerson.setPositionRelativeToVehicle(new Position(0.0, 0.0, 0.0));
        this.adultPerson.setSize(new Size(0.418, 1.79, 0.354));
    }
    // </editor-fold>

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public AdultPerson getAdultPerson() {
        return this.adultPerson;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final AdultPerson adultPerson = new AdultPerson(new AdultPersonResource(Gender.MALE, new Color(0.89, 0.639, 0.498), BaseEyeColor.GREEN, MaleAdultHairMohawk.BLOND, 0.374677, MaleAdultFullBodyOutfitMaternityComfy.GREEN_GREY, BaseFace.HUMAN_19));
}
