import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { N27Page } from './n27.page';

const routes: Routes = [
  {
    path: '',
    component: N27Page
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class N27PageRoutingModule {}
