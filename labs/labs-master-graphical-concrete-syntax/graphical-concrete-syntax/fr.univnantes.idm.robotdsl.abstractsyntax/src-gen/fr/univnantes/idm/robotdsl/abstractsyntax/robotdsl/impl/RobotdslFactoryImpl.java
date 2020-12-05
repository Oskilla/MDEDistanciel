/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl;

import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotdslFactoryImpl extends EFactoryImpl implements RobotdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotdslFactory init() {
		try {
			RobotdslFactory theRobotdslFactory = (RobotdslFactory) EPackage.Registry.INSTANCE
					.getEFactory(RobotdslPackage.eNS_URI);
			if (theRobotdslFactory != null) {
				return theRobotdslFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotdslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RobotdslPackage.ROBOT:
			return createRobot();
		case RobotdslPackage.ROBOT_PROGRAM:
			return createRobotProgram();
		case RobotdslPackage.LIGHT:
			return createLight();
		case RobotdslPackage.MOTOR:
			return createMotor();
		case RobotdslPackage.ROBOT_SIMULATION:
			return createRobotSimulation();
		case RobotdslPackage.SET_LIGHT_COLOR:
			return createSetLightColor();
		case RobotdslPackage.MOVE_FORWARD:
			return createMoveForward();
		case RobotdslPackage.ROTATE:
			return createRotate();
		case RobotdslPackage.WHEEL:
			return createWheel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RobotdslPackage.LIGHT_COLOR:
			return createLightColorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RobotdslPackage.LIGHT_COLOR:
			return convertLightColorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotProgram createRobotProgram() {
		RobotProgramImpl robotProgram = new RobotProgramImpl();
		return robotProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Motor createMotor() {
		MotorImpl motor = new MotorImpl();
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotSimulation createRobotSimulation() {
		RobotSimulationImpl robotSimulation = new RobotSimulationImpl();
		return robotSimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetLightColor createSetLightColor() {
		SetLightColorImpl setLightColor = new SetLightColorImpl();
		return setLightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoveForward createMoveForward() {
		MoveForwardImpl moveForward = new MoveForwardImpl();
		return moveForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wheel createWheel() {
		WheelImpl wheel = new WheelImpl();
		return wheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightColor createLightColorFromString(EDataType eDataType, String initialValue) {
		LightColor result = LightColor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLightColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotdslPackage getRobotdslPackage() {
		return (RobotdslPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotdslPackage getPackage() {
		return RobotdslPackage.eINSTANCE;
	}

} //RobotdslFactoryImpl
