package dndv2;
import org.qtjambi.qt.core.*;
import org.qtjambi.qt.gui.*;
import org.qtjambi.qt.widgets.*;

public class Main extends QWidget {

    public Main() {
        // Titre de la fenêtre
        setWindowTitle("Fiche de personnage D&D");

        // Disposition principale
        QVBoxLayout layout = new QVBoxLayout();
        
        // Créer des sections de la feuille
        layout.addWidget(createHeaderSection());
        layout.addWidget(createMainStatsSection());
        layout.addWidget(createSkillsSection());
        layout.addWidget(createHealthSection());
        layout.addWidget(createPersonalitySection());
        layout.addWidget(createAttacksAndSpellsSection());
        layout.addWidget(createEquipmentSection());

        // Appliquer la disposition
        setLayout(layout);
    }

    private QWidget createHeaderSection() {
        QGroupBox headerGroup = new QGroupBox("Informations du personnage");
        QFormLayout formLayout = new QFormLayout();

        // Champs d'information du personnage
        String[] labels = {"Nom du personnage", "Classe & niveau", "Historique", "Nom du joueur", "Race", "Alignement", "Points d'expérience"};
        for (String label : labels) {
            formLayout.addRow(new QLabel(label), new QLineEdit());
        }

        headerGroup.setLayout(formLayout);
        return headerGroup;
    }

    private QWidget createMainStatsSection() {
        QGroupBox statsGroup = new QGroupBox("Caractéristiques");
        QVBoxLayout layout = new QVBoxLayout();

        // Champs de caractéristiques
        String[] stats = {"Force", "Dextérité", "Constitution", "Intelligence", "Sagesse", "Charisme"};
        for (String stat : stats) {
            QHBoxLayout statLayout = new QHBoxLayout();
            statLayout.addWidget(new QLabel(stat));
            statLayout.addWidget(new QLineEdit());
            layout.addLayout(statLayout);
        }

        statsGroup.setLayout(layout);
        return statsGroup;
    }

    private QWidget createSkillsSection() {
        QGroupBox skillsGroup = new QGroupBox("Compétences et jets de sauvegarde");
        QVBoxLayout layout = new QVBoxLayout();

        // Cases à cocher pour les compétences
        String[] skills = {"Acrobaties (Dex)", "Arcanes (Int)", "Athlétisme (For)", "Discrétion (Dex)", "Dressage (Sag)", 
                           "Escamotage (Dex)", "Histoire (Int)", "Intimidation (Cha)", "Investigation (Int)", 
                           "Médecine (Sag)", "Nature (Int)", "Perception (Sag)", "Perspicacité (Sag)", 
                           "Persuasion (Cha)", "Religion (Int)", "Représentation (Cha)", "Survie (Sag)", 
                           "Tromperie (Cha)"};
        for (String skill : skills) {
            QCheckBox checkBox = new QCheckBox(skill);
            layout.addWidget(checkBox);
        }

        skillsGroup.setLayout(layout);
        return skillsGroup;
    }

    private QWidget createHealthSection() {
        QGroupBox healthGroup = new QGroupBox("Points de vie et autres stats");
        QFormLayout formLayout = new QFormLayout();

        // Champs de points de vie et autres stats
        String[] stats = {"Points de vie actuels", "Points de vie temporaires", "Initiative", "Vitesse", "Classe d'armure"};
        for (String stat : stats) {
            formLayout.addRow(new QLabel(stat), new QLineEdit());
        }

        healthGroup.setLayout(formLayout);
        return healthGroup;
    }

    private QWidget createPersonalitySection() {
        QGroupBox personalityGroup = new QGroupBox("Traits de personnalité");
        QVBoxLayout layout = new QVBoxLayout();

        // Champs de traits de personnalité
        String[] traits = {"Traits de personnalité", "Idéaux", "Liens", "Défauts"};
        for (String trait : traits) {
            QVBoxLayout traitLayout = new QVBoxLayout();
            traitLayout.addWidget(new QLabel(trait));
            traitLayout.addWidget(new QTextEdit());
            layout.addLayout(traitLayout);
        }

        personalityGroup.setLayout(layout);
        return personalityGroup;
    }

    private QWidget createAttacksAndSpellsSection() {
        QGroupBox attacksGroup = new QGroupBox("Attaques et sorts");
        QTextEdit area = new QTextEdit();
        area.setPlaceholderText("Listez vos attaques et sorts ici...");
        QVBoxLayout layout = new QVBoxLayout();
        layout.addWidget(area);
        attacksGroup.setLayout(layout);
        return attacksGroup;
    }

    private QWidget createEquipmentSection() {
        QGroupBox equipmentGroup = new QGroupBox("Équipement");
        QTextEdit area = new QTextEdit();
        area.setPlaceholderText("Listez votre équipement ici...");
        QVBoxLayout layout = new QVBoxLayout();
        layout.addWidget(area);
        equipmentGroup.setLayout(layout);
        return equipmentGroup;
    }

    public static void main(String[] args) {
        QApplication.initialize(args);
        FeuillePersonnage window = new FeuillePersonnage();
        window.resize(800, 600);
        window.show();
        QApplication.exec();
    }
}
