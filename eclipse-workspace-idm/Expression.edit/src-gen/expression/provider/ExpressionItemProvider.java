/**
 */
package expression.provider;

import expression.Expression;
import expression.ExpressionFactory;
import expression.ExpressionPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link expression.Expression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNomPropertyDescriptor(object);
			addEntreePropertyDescriptor(object);
			addSortiePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNomPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Expression_nom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Expression_nom_feature",
								"_UI_Expression_type"),
						ExpressionPackage.Literals.EXPRESSION__NOM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Entree feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntreePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Expression_entree_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Expression_entree_feature",
								"_UI_Expression_type"),
						ExpressionPackage.Literals.EXPRESSION__ENTREE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sortie feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortiePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Expression_sortie_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Expression_sortie_feature",
								"_UI_Expression_type"),
						ExpressionPackage.Literals.EXPRESSION__SORTIE, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExpressionPackage.Literals.EXPRESSION__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Expression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Expression"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Expression) object).getNom();
		return label == null || label.length() == 0 ? getString("_UI_Expression_type")
				: getString("_UI_Expression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Expression.class)) {
		case ExpressionPackage.EXPRESSION__NOM:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ExpressionPackage.EXPRESSION__ELEMENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createEntree()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createSortie()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createConstante()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createOppose()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createInverse()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createSinus()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createCosinus()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createRacine_carree()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createExponentielle()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createSoustraction()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createMinimum()));

		newChildDescriptors.add(createChildParameter(ExpressionPackage.Literals.EXPRESSION__ELEMENTS,
				ExpressionFactory.eINSTANCE.createMaximum()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExpressionEditPlugin.INSTANCE;
	}

}
