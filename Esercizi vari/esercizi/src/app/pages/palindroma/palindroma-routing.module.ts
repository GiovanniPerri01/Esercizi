import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PalindromaPage } from './palindroma.page';

const routes: Routes = [
  {
    path: '',
    component: PalindromaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PalindromaPageRoutingModule {}
