<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#DFF3E7"
    android:backgroundTint="#DFF3E7"
    android:foregroundTint="#DFF3E7"
    tools:context=".MainActivity"
    tools:ignore="ExtraText">

    <ImageView
        android:id="@+id/imageView8"
        android:layout_width="20dp"
        android:layout_height="21dp"
        app:srcCompat="@drawable/mais"
        tools:layout_editor_absoluteX="342dp"
        tools:layout_editor_absoluteY="383dp"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Título"
        android:textColor="#000000"
        android:textSize="16sp"
        tools:layout_editor_absoluteX="45dp"
        tools:layout_editor_absoluteY="42dp"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="321dp"
        android:layout_height="31dp"
        android:background="#0D9D9D9F"
        android:backgroundTint="#D9D9D9"
        android:backgroundTintMode="add"
        android:hint="Crie um título"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="45dp"
        tools:layout_editor_absoluteY="64dp" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Adicionar descrição"
        android:textColor="#000000"
        android:textSize="16sp"
        tools:layout_editor_absoluteX="46dp"
        tools:layout_editor_absoluteY="115dp"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="323dp"
        android:layout_height="215dp"
        android:background="#D9D9D9"
        android:hint="Adicione uma descrição"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="44dp"
        tools:layout_editor_absoluteY="136dp" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Adicionar link"
        android:textColor="#000000"
        android:textSize="16sp"
        tools:layout_editor_absoluteX="79dp"
        tools:layout_editor_absoluteY="386dp"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Fazer uploud de arquivo"
        android:textColor="#000000"
        android:textSize="16sp"
        tools:layout_editor_absoluteX="79dp"
        tools:layout_editor_absoluteY="418dp"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Escolher categoria"
        android:textColor="#000000"
        android:textSize="16sp"
        tools:layout_editor_absoluteX="79dp"
        tools:layout_editor_absoluteY="456dp"
        tools:ignore="MissingConstraints" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="24dp"
        android:layout_height="25dp"
        app:srcCompat="@drawable/categoria"
        tools:layout_editor_absoluteX="50dp"
        tools:layout_editor_absoluteY="415dp"
        tools:ignore="MissingConstraints" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="28dp"
        android:layout_height="26dp"
        app:srcCompat="@drawable/seta"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="7dp"
        tools:layout_editor_absoluteY="7dp" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="24dp"
        android:layout_height="25dp"
        app:srcCompat="@drawable/link"
        tools:layout_editor_absoluteX="50dp"
        tools:layout_editor_absoluteY="383dp"
        tools:ignore="MissingConstraints" />

    <ImageView
        android:id="@+id/imageView4"
        android:layout_width="24dp"
        android:layout_height="25dp"
        app:srcCompat="@drawable/upload"
        tools:layout_editor_absoluteX="50dp"
        tools:layout_editor_absoluteY="454dp"
        tools:ignore="MissingConstraints" /><![CDATA[

    />
    ]]>

    <Button
        android:id="@+id/angry_btn"
        android:layout_width="216dp"
        android:layout_height="39dp"
        android:background="@drawable/buttonenviar"
        android:shadowColor="#FFFFFF"
        android:shadowDx="0"
        android:shadowDy="0"
        android:shadowRadius="0"
        android:text="Enviar"
        android:textColor="#FCFCFC"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteY="587dp" />

    <ImageView
        android:id="@+id/imageView5"
        android:layout_width="20dp"
        android:layout_height="21dp"
        app:srcCompat="@drawable/setadireita"
        tools:layout_editor_absoluteX="343dp"
        tools:layout_editor_absoluteY="456dp"
        tools:ignore="MissingConstraints" />

    <ImageView
        android:id="@+id/imageView9"
        android:layout_width="20dp"
        android:layout_height="21dp"
        app:srcCompat="@drawable/mais"
        tools:layout_editor_absoluteX="342dp"
        tools:layout_editor_absoluteY="418dp"
        tools:ignore="MissingConstraints" />

</android.support.constraint.ConstraintLayout>
