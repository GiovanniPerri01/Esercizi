import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { N32Page } from './n32.page';

const routes: Routes = [
  {
    path: '',
    component: N32Page
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class N32PageRoutingModule {}
