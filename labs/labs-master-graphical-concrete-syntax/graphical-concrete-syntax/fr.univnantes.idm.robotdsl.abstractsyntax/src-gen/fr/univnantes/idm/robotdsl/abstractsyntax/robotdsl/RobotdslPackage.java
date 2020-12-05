/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslFactory
 * @model kind="package"
 * @generated
 */
public interface RobotdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robotdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotdslPackage eINSTANCE = fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.NamedElementImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotProgramImpl <em>Robot Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotProgramImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRobotProgram()
	 * @generated
	 */
	int ROBOT_PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM__COMMANDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM__ROBOT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Robot Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Robot Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.ComponentImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.LightImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MotorImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__POWER = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Powered Wheels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__POWERED_WHEELS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotSimulationImpl <em>Robot Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotSimulationImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRobotSimulation()
	 * @generated
	 */
	int ROBOT_SIMULATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SIMULATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SIMULATION__ROBOTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SIMULATION__PROGRAMS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Robot Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SIMULATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Robot Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_SIMULATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.CommandImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 6;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.SetLightColorImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getSetLightColor()
	 * @generated
	 */
	int SET_LIGHT_COLOR = 7;

	/**
	 * The feature id for the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__LIGHT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__COLOR = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MoveForwardImpl <em>Move Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MoveForwardImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getMoveForward()
	 * @generated
	 */
	int MOVE_FORWARD = 8;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD__DISTANCE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RotateImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 9;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.WheelImpl <em>Wheel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.WheelImpl
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getWheel()
	 * @generated
	 */
	int WHEEL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Motor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__MOTOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wheel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wheel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor <em>Light Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getLightColor()
	 * @generated
	 */
	int LIGHT_COLOR = 12;

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot#getComponents()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Components();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram <em>Robot Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Program</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram
	 * @generated
	 */
	EClass getRobotProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram#getCommands()
	 * @see #getRobotProgram()
	 * @generated
	 */
	EReference getRobotProgram_Commands();

	/**
	 * Returns the meta object for the reference '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robot</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram#getRobot()
	 * @see #getRobotProgram()
	 * @generated
	 */
	EReference getRobotProgram_Robot();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the attribute '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPower()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Power();

	/**
	 * Returns the meta object for the reference list '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPoweredWheels <em>Powered Wheels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Powered Wheels</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor#getPoweredWheels()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_PoweredWheels();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation <em>Robot Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Simulation</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation
	 * @generated
	 */
	EClass getRobotSimulation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robots</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation#getRobots()
	 * @see #getRobotSimulation()
	 * @generated
	 */
	EReference getRobotSimulation_Robots();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation#getPrograms()
	 * @see #getRobotSimulation()
	 * @generated
	 */
	EReference getRobotSimulation_Programs();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor <em>Set Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Light Color</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor
	 * @generated
	 */
	EClass getSetLightColor();

	/**
	 * Returns the meta object for the reference '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Light</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getLight()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EReference getSetLightColor_Light();

	/**
	 * Returns the meta object for the attribute '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor#getColor()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EAttribute getSetLightColor_Color();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward <em>Move Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Forward</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward
	 * @generated
	 */
	EClass getMoveForward();

	/**
	 * Returns the meta object for the attribute '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward#getDistance()
	 * @see #getMoveForward()
	 * @generated
	 */
	EAttribute getMoveForward_Distance();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate#getAngle()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Angle();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel
	 * @generated
	 */
	EClass getWheel();

	/**
	 * Returns the meta object for the reference '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel#getMotor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Motor</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel#getMotor()
	 * @see #getWheel()
	 * @generated
	 */
	EReference getWheel_Motor();

	/**
	 * Returns the meta object for enum '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor <em>Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Light Color</em>'.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor
	 * @generated
	 */
	EEnum getLightColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotdslFactory getRobotdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__COMPONENTS = eINSTANCE.getRobot_Components();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotProgramImpl <em>Robot Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotProgramImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRobotProgram()
		 * @generated
		 */
		EClass ROBOT_PROGRAM = eINSTANCE.getRobotProgram();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROGRAM__COMMANDS = eINSTANCE.getRobotProgram_Commands();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROGRAM__ROBOT = eINSTANCE.getRobotProgram_Robot();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.ComponentImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.LightImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MotorImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__POWER = eINSTANCE.getMotor_Power();

		/**
		 * The meta object literal for the '<em><b>Powered Wheels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__POWERED_WHEELS = eINSTANCE.getMotor_PoweredWheels();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotSimulationImpl <em>Robot Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotSimulationImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRobotSimulation()
		 * @generated
		 */
		EClass ROBOT_SIMULATION = eINSTANCE.getRobotSimulation();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SIMULATION__ROBOTS = eINSTANCE.getRobotSimulation_Robots();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_SIMULATION__PROGRAMS = eINSTANCE.getRobotSimulation_Programs();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.CommandImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.SetLightColorImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getSetLightColor()
		 * @generated
		 */
		EClass SET_LIGHT_COLOR = eINSTANCE.getSetLightColor();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIGHT_COLOR__LIGHT = eINSTANCE.getSetLightColor_Light();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LIGHT_COLOR__COLOR = eINSTANCE.getSetLightColor_Color();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MoveForwardImpl <em>Move Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.MoveForwardImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getMoveForward()
		 * @generated
		 */
		EClass MOVE_FORWARD = eINSTANCE.getMoveForward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_FORWARD__DISTANCE = eINSTANCE.getMoveForward_Distance();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RotateImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__ANGLE = eINSTANCE.getRotate_Angle();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.NamedElementImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.WheelImpl <em>Wheel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.WheelImpl
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getWheel()
		 * @generated
		 */
		EClass WHEEL = eINSTANCE.getWheel();

		/**
		 * The meta object literal for the '<em><b>Motor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEEL__MOTOR = eINSTANCE.getWheel_Motor();

		/**
		 * The meta object literal for the '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor <em>Light Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.LightColor
		 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.impl.RobotdslPackageImpl#getLightColor()
		 * @generated
		 */
		EEnum LIGHT_COLOR = eINSTANCE.getLightColor();

	}

} //RobotdslPackage
