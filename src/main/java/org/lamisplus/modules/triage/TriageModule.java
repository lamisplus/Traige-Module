package org.lamisplus.modules.triage;

import com.foreach.across.config.AcrossApplication;
import com.foreach.across.core.AcrossModule;
import com.foreach.across.core.context.configurer.ComponentScanConfigurer;
import com.foreach.across.modules.hibernate.jpa.AcrossHibernateJpaModule;
import org.lamisplus.modules.patient.PatientModule;

@AcrossApplication(
		modules = {
				AcrossHibernateJpaModule.NAME,
				PatientModule.NAME
		})
public class TriageModule extends AcrossModule {

		public static final String NAME = "TriageModule";


    public TriageModule() {
		super ();
		addApplicationContextConfigurer (new ComponentScanConfigurer (
				getClass ().getPackage ().getName () + ".domain",
				getClass ().getPackage ().getName () + ".repository",
				getClass ().getPackage ().getName () + ".config",
				getClass ().getPackage ().getName () + ".service",
				getClass ().getPackage ().getName () + ".controller",
				"org.lamisplus.modules.base.service"
		));

	}

		@Override
		public String getName() {
		return NAME;
	}


}
