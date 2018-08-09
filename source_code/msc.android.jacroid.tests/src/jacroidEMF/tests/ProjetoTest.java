/**
 */
package jacroidEMF.tests;

import jacroidEMF.JacroidEMFFactory;
import jacroidEMF.Projeto;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Projeto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetoTest extends TestCase {

	/**
	 * The fixture for this Projeto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Projeto fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjetoTest.class);
	}

	/**
	 * Constructs a new Projeto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Projeto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Projeto fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Projeto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Projeto getFixture() {
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
		setFixture(JacroidEMFFactory.eINSTANCE.createProjeto());
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

} //ProjetoTest
