/**
 */
package jacroidEMF.tests;

import jacroidEMF.ItemEnum;
import jacroidEMF.JacroidEMFFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Item Enum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemEnumTest extends TestCase {

	/**
	 * The fixture for this Item Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemEnum fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ItemEnumTest.class);
	}

	/**
	 * Constructs a new Item Enum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemEnumTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Item Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ItemEnum fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Item Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemEnum getFixture() {
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
		setFixture(JacroidEMFFactory.eINSTANCE.createItemEnum());
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

} //ItemEnumTest
