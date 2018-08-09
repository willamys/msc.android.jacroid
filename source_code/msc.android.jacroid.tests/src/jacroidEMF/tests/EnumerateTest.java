/**
 */
package jacroidEMF.tests;

import jacroidEMF.Enumerate;
import jacroidEMF.JacroidEMFFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enumerate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerateTest extends TestCase {

	/**
	 * The fixture for this Enumerate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enumerate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumerateTest.class);
	}

	/**
	 * Constructs a new Enumerate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enumerate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Enumerate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enumerate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enumerate getFixture() {
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
		setFixture(JacroidEMFFactory.eINSTANCE.createEnumerate());
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

} //EnumerateTest
