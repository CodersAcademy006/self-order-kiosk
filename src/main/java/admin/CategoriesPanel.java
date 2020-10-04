/*
 * Copyright (c) 2020 Self-Order Kiosk
 */
package admin;

public class CategoriesPanel extends javax.swing.JPanel {

  /**
   * Creates new form CategoriesPanel
   */
  public CategoriesPanel() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    scpCategories = new javax.swing.JScrollPane();
    tblCategories = new javax.swing.JTable();
    pnlCategoryFields = new javax.swing.JPanel();
    lblCategoryName = new javax.swing.JLabel();
    txtCategoryName = new javax.swing.JTextField();
    pnlCategoryActions = new javax.swing.JPanel();
    btnCategoryRefresh = new javax.swing.JButton();
    btnCategorySave = new javax.swing.JButton();
    btnCategoryNew = new javax.swing.JButton();
    btnCategoryDelete = new javax.swing.JButton();

    setPreferredSize(new java.awt.Dimension(720, 600));
    setLayout(new java.awt.GridBagLayout());

    tblCategories.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {"1", "Meal Combos"}
      },
      new String [] {
        "ID", "Category"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    scpCategories.setViewportView(tblCategories);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(scpCategories, gridBagConstraints);

    java.awt.GridBagLayout pnlCategoryFieldsLayout = new java.awt.GridBagLayout();
    pnlCategoryFieldsLayout.columnWidths = new int[] {100, 300};
    pnlCategoryFieldsLayout.rowHeights = new int[] {60};
    pnlCategoryFields.setLayout(pnlCategoryFieldsLayout);

    lblCategoryName.setLabelFor(txtCategoryName);
    lblCategoryName.setText("Category");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlCategoryFields.add(lblCategoryName, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlCategoryFields.add(txtCategoryName, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(pnlCategoryFields, gridBagConstraints);

    pnlCategoryActions.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

    btnCategoryRefresh.setText("Refresh");
    pnlCategoryActions.add(btnCategoryRefresh);

    btnCategorySave.setText("Save");
    pnlCategoryActions.add(btnCategorySave);

    btnCategoryNew.setText("New");
    pnlCategoryActions.add(btnCategoryNew);

    btnCategoryDelete.setText("Delete");
    btnCategoryDelete.setToolTipText("");
    pnlCategoryActions.add(btnCategoryDelete);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    add(pnlCategoryActions, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCategoryDelete;
  private javax.swing.JButton btnCategoryNew;
  private javax.swing.JButton btnCategoryRefresh;
  private javax.swing.JButton btnCategorySave;
  private javax.swing.JLabel lblCategoryName;
  private javax.swing.JPanel pnlCategoryActions;
  private javax.swing.JPanel pnlCategoryFields;
  private javax.swing.JScrollPane scpCategories;
  private javax.swing.JTable tblCategories;
  private javax.swing.JTextField txtCategoryName;
  // End of variables declaration//GEN-END:variables
}