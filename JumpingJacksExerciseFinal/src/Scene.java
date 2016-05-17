// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.MaleTeenHairHatBallcapNPC;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.MaleTeenFullBodyOutfitHipJersey;
import org.lgna.story.event.KeyEvent;
import org.lgna.story.resources.sims2.TeenPersonResource;
import org.lgna.story.resources.sims2.BaseEyeColor;
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
        this.addKeyPressListener((KeyEvent event) -> {
            this.teenPerson.jumpingjack();
        });
    }

    public void myFirstMethod() {
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
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.teenPerson.setPaint(Color.WHITE);
        this.teenPerson.setOpacity(1.0);
        this.teenPerson.setName("teenPerson");
        this.teenPerson.setVehicle(this);
        this.teenPerson.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.teenPerson.setPositionRelativeToVehicle(new Position(0.0, 0.0, 0.0));
        this.teenPerson.setSize(new Size(0.465, 1.62, 0.337));
    }
    // </editor-fold>

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public TeenPerson getTeenPerson() {
        return this.teenPerson;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final TeenPerson teenPerson = new TeenPerson(new TeenPersonResource(Gender.MALE, new Color(0.89, 0.639, 0.498), BaseEyeColor.DARK_BLUE, MaleTeenHairHatBallcapNPC.RED, 0.267646, MaleTeenFullBodyOutfitHipJersey.RED, BaseFace.HUMAN_18));
}
