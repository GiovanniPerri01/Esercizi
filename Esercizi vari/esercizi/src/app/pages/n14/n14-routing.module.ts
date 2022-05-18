import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { N14Page } from './n14.page';

const routes: Routes = [
  {
    path: '',
    component: N14Page
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class N14PageRoutingModule {}
