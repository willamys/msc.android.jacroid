/**
 */
package jacroidEMF.tests;

import jacroidEMF.FirebaseAuth;
import jacroidEMF.JacroidEMFFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Firebase Auth</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FirebaseAuthTest extends TestCase {

	/**
	 * The fixture for this Firebase Auth test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirebaseAuth fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FirebaseAuthTest.class);
	}

	/**
	 * Constructs a new Firebase Auth test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirebaseAuthTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Firebase Auth test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FirebaseAuth fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Firebase Auth test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirebaseAuth getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JacroidEMFFactory.eINSTANCE.createFirebaseAuth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FirebaseAuthTest
