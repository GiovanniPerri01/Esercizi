import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { N36Page } from './n36.page';

const routes: Routes = [
  {
    path: '',
    component: N36Page
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class N36PageRoutingModule {}
