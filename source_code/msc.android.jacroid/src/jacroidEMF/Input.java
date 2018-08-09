/**
 */
package jacroidEMF;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Input</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jacroidEMF.JacroidEMFPackage#getInput()
 * @model
 * @generated
 */
public enum Input implements Enumerator {
	/**
	 * The '<em><b>Select</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT(0, "select", "select"), /**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(1, "text", "text"), /**
	 * The '<em><b>Checkbox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(2, "checkbox", "checkbox"), /**
	 * The '<em><b>Radiobutton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIOBUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	RADIOBUTTON(3, "radiobutton", "radiobutton"), /**
	 * The '<em><b>Hidden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	HIDDEN(4, "hidden", "hidden"), /**
	 * The '<em><b>Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(5, "image", "image");

	/**
	 * The '<em><b>Select</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Select</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @model name="select"
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_VALUE = 0;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 1;

	/**
	 * The '<em><b>Checkbox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checkbox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model name="checkbox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 2;

	/**
	 * The '<em><b>Radiobutton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radiobutton</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIOBUTTON
	 * @model name="radiobutton"
	 * @generated
	 * @ordered
	 */
	public static final int RADIOBUTTON_VALUE = 3;

	/**
	 * The '<em><b>Hidden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hidden</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDDEN
	 * @model name="hidden"
	 * @generated
	 * @ordered
	 */
	public static final int HIDDEN_VALUE = 4;

	/**
	 * The '<em><b>Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model name="image"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Input</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Input[] VALUES_ARRAY =
		new Input[] {
			SELECT,
			TEXT,
			CHECKBOX,
			RADIOBUTTON,
			HIDDEN,
			IMAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Input</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Input> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Input</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Input get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Input result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Input</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Input getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Input result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Input</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Input get(int value) {
		switch (value) {
			case SELECT_VALUE: return SELECT;
			case TEXT_VALUE: return TEXT;
			case CHECKBOX_VALUE: return CHECKBOX;
			case RADIOBUTTON_VALUE: return RADIOBUTTON;
			case HIDDEN_VALUE: return HIDDEN;
			case IMAGE_VALUE: return IMAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Input(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Input
