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
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
