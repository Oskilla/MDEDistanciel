/**
 */
package fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.util;

import fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotdslPackage
 * @generated
 */
public class RobotdslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotdslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotdslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RobotdslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotdslSwitch<Adapter> modelSwitch = new RobotdslSwitch<Adapter>() {
		@Override
		public Adapter caseRobot(Robot object) {
			return createRobotAdapter();
		}

		@Override
		public Adapter caseRobotProgram(RobotProgram object) {
			return createRobotProgramAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseLight(Light object) {
			return createLightAdapter();
		}

		@Override
		public Adapter caseMotor(Motor object) {
			return createMotorAdapter();
		}

		@Override
		public Adapter caseRobotSimulation(RobotSimulation object) {
			return createRobotSimulationAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseSetLightColor(SetLightColor object) {
			return createSetLightColorAdapter();
		}

		@Override
		public Adapter caseMoveForward(MoveForward object) {
			return createMoveForwardAdapter();
		}

		@Override
		public Adapter caseRotate(Rotate object) {
			return createRotateAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseWheel(Wheel object) {
			return createWheelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram <em>Robot Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotProgram
	 * @generated
	 */
	public Adapter createRobotProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Light
	 * @generated
	 */
	public Adapter createLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation <em>Robot Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.RobotSimulation
	 * @generated
	 */
	public Adapter createRobotSimulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor <em>Set Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.SetLightColor
	 * @generated
	 */
	public Adapter createSetLightColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward <em>Move Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.MoveForward
	 * @generated
	 */
	public Adapter createMoveForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univnantes.idm.robotdsl.abstractsyntax.robotdsl.Wheel
	 * @generated
	 */
	public Adapter createWheelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RobotdslAdapterFactory
