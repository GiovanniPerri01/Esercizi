import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { N10Page } from './n10.page';

const routes: Routes = [
  {
    path: '',
    component: N10Page
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class N10PageRoutingModule {}
