import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./pages/home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'n7b',
    loadChildren: () => import('./pages/n7b/n7b.module').then( m => m.N7bPageModule)
  },
  {
    path: 'n10',
    loadChildren: () => import('./pages/n10/n10.module').then( m => m.N10PageModule)
  },
  {
    path: 'n14',
    loadChildren: () => import('./pages/n14/n14.module').then( m => m.N14PageModule)
  },
  {
    path: 'n27',
    loadChildren: () => import('./pages/n27/n27.module').then( m => m.N27PageModule)
  },
  {
    path: 'n32',
    loadChildren: () => import('./pages/n32/n32.module').then( m => m.N32PageModule)
  },
  {
    path: 'n36',
    loadChildren: () => import('./pages/n36/n36.module').then( m => m.N36PageModule)
  },
  {
    path: 'palindroma',
    loadChildren: () => import('./pages/palindroma/palindroma.module').then( m => m.PalindromaPageModule)
  },
  {
    path: 'stringhe-concatenate',
    loadChildren: () => import('./pages/stringhe-concatenate/stringhe-concatenate.module').then( m => m.StringheConcatenatePageModule)
  },
  {
    path: 'stringa-composta',
    loadChildren: () => import('./pages/stringa-composta/stringa-composta.module').then( m => m.StringaCompostaPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
