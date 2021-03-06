package com.e.occanotestsidep.persistence.Graph.async.combPres;

import android.os.AsyncTask;

import com.e.occanosidetest.models.Log;
import com.e.occanotestsidep.persistence.Graph.daoGraph.CombPresDao;
import com.e.occanotestsidep.persistence.LogDao;
import com.e.occanotestsidep.ui.models.CombPresForGraph;


public class DeleteAsyncTask extends AsyncTask<CombPresForGraph, Void, Void> {

    private CombPresDao combPresDao;

    public DeleteAsyncTask(CombPresDao dao) {
        combPresDao = dao;
    }

    @Override
    protected Void doInBackground(CombPresForGraph... combPresForGraphs) {
        combPresDao.delete(combPresForGraphs);
        return null;
    }
}
