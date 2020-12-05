/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl;

import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Command;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Component;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Light;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.NamedElement;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslFactory;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor;
import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotdslPackageImpl extends EPackageImpl implements RobotdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotSimulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setLightColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wheelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lightColorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotdslPackageImpl() {
		super(eNS_URI, RobotdslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RobotdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotdslPackage init() {
		if (isInited)
			return (RobotdslPackage) EPackage.Registry.INSTANCE.getEPackage(RobotdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRobotdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RobotdslPackageImpl theRobotdslPackage = registeredRobotdslPackage instanceof RobotdslPackageImpl
				? (RobotdslPackageImpl) registeredRobotdslPackage
				: new RobotdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRobotdslPackage.createPackageContents();

		// Initialize created meta-data
		theRobotdslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotdslPackage.eNS_URI, theRobotdslPackage);
		return theRobotdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_Components() {
		return (EReference) robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobotProgram() {
		return robotProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotProgram_Commands() {
		return (EReference) robotProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotProgram_Robot() {
		return (EReference) robotProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLight() {
		return lightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMotor_Power() {
		return (EAttribute) motorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMotor_PoweredWheels() {
		return (EReference) motorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobotSimulation() {
		return robotSimulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotSimulation_Robots() {
		return (EReference) robotSimulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotSimulation_Programs() {
		return (EReference) robotSimulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetLightColor() {
		return setLightColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetLightColor_Light() {
		return (EReference) setLightColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetLightColor_Color() {
		return (EAttribute) setLightColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoveForward() {
		return moveForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoveForward_Distance() {
		return (EAttribute) moveForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRotate_Angle() {
		return (EAttribute) rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWheel() {
		return wheelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWheel_Motor() {
		return (EReference) wheelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLightColor() {
		return lightColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotdslFactory getRobotdslFactory() {
		return (RobotdslFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		robotEClass = createEClass(ROBOT);
		createEReference(robotEClass, ROBOT__COMPONENTS);

		robotProgramEClass = createEClass(ROBOT_PROGRAM);
		createEReference(robotProgramEClass, ROBOT_PROGRAM__COMMANDS);
		createEReference(robotProgramEClass, ROBOT_PROGRAM__ROBOT);

		componentEClass = createEClass(COMPONENT);

		lightEClass = createEClass(LIGHT);

		motorEClass = createEClass(MOTOR);
		createEAttribute(motorEClass, MOTOR__POWER);
		createEReference(motorEClass, MOTOR__POWERED_WHEELS);

		robotSimulationEClass = createEClass(ROBOT_SIMULATION);
		createEReference(robotSimulationEClass, ROBOT_SIMULATION__ROBOTS);
		createEReference(robotSimulationEClass, ROBOT_SIMULATION__PROGRAMS);

		commandEClass = createEClass(COMMAND);

		setLightColorEClass = createEClass(SET_LIGHT_COLOR);
		createEReference(setLightColorEClass, SET_LIGHT_COLOR__LIGHT);
		createEAttribute(setLightColorEClass, SET_LIGHT_COLOR__COLOR);

		moveForwardEClass = createEClass(MOVE_FORWARD);
		createEAttribute(moveForwardEClass, MOVE_FORWARD__DISTANCE);

		rotateEClass = createEClass(ROTATE);
		createEAttribute(rotateEClass, ROTATE__ANGLE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		wheelEClass = createEClass(WHEEL);
		createEReference(wheelEClass, WHEEL__MOTOR);

		// Create enums
		lightColorEEnum = createEEnum(LIGHT_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		robotEClass.getESuperTypes().add(this.getNamedElement());
		robotProgramEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getNamedElement());
		lightEClass.getESuperTypes().add(this.getComponent());
		motorEClass.getESuperTypes().add(this.getComponent());
		robotSimulationEClass.getESuperTypes().add(this.getNamedElement());
		setLightColorEClass.getESuperTypes().add(this.getCommand());
		moveForwardEClass.getESuperTypes().add(this.getCommand());
		rotateEClass.getESuperTypes().add(this.getCommand());
		wheelEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobot_Components(), this.getComponent(), null, "components", null, 0, -1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotProgramEClass, RobotProgram.class, "RobotProgram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobotProgram_Commands(), this.getCommand(), null, "commands", null, 0, -1, RobotProgram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotProgram_Robot(), this.getRobot(), null, "robot", null, 1, 1, RobotProgram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightEClass, Light.class, "Light", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotor_Power(), ecorePackage.getEInt(), "power", null, 0, 1, Motor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_PoweredWheels(), this.getWheel(), this.getWheel_Motor(), "poweredWheels", null, 0, -1,
				Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotSimulationEClass, RobotSimulation.class, "RobotSimulation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobotSimulation_Robots(), this.getRobot(), null, "robots", null, 0, -1, RobotSimulation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotSimulation_Programs(), this.getRobotProgram(), null, "programs", null, 0, -1,
				RobotSimulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setLightColorEClass, SetLightColor.class, "SetLightColor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetLightColor_Light(), this.getLight(), null, "light", null, 1, 1, SetLightColor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetLightColor_Color(), this.getLightColor(), "color", "NONE", 1, 1, SetLightColor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveForwardEClass, MoveForward.class, "MoveForward", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveForward_Distance(), ecorePackage.getEInt(), "distance", null, 1, 1, MoveForward.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotate_Angle(), ecorePackage.getEInt(), "angle", null, 1, 1, Rotate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wheelEClass, Wheel.class, "Wheel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWheel_Motor(), this.getMotor(), this.getMotor_PoweredWheels(), "motor", null, 0, 1,
				Wheel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lightColorEEnum, LightColor.class, "LightColor");
		addEEnumLiteral(lightColorEEnum, LightColor.GREEN);
		addEEnumLiteral(lightColorEEnum, LightColor.RED);
		addEEnumLiteral(lightColorEEnum, LightColor.BLUE);
		addEEnumLiteral(lightColorEEnum, LightColor.YELLOW);
		addEEnumLiteral(lightColorEEnum, LightColor.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //RobotdslPackageImpl
