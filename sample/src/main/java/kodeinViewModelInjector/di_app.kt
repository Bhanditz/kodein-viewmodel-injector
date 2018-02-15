package kodeinViewModelInjector

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.conf.ConfigurableKodein
import com.github.salomonbrys.kodein.singleton

val kodeinApp = Kodein {
    bind<CatService>() with singleton { InMemCatService(null) }
}

val kodeinBase = ConfigurableKodein(mutable = true)
        .apply {
            addExtend(kodeinApp)
        }