# Weekly Collation of Tickets Completed on Personal Kanban Board
___

## Feb

### 2015-02-23 -> 2015-03-01
 * Settlement.
 * Masterlist load.
 * Closed off the Hanson NMIs.
 * Loaded Essendon and 44 market Street Prices
 * Discuss very large Network Accrual (46 million) with Nicole
 * Mapped the new set of Victorian retail tariffs for Network Accrual.
 * Get Johns new vagrant running locally
 * Email the dev team about remoting changes
 * Wayne Spring Mappings for server deployment
 * Travel bookings for March
 * Write groovy script to remote test Wayne functionality.
 * Cut a red common release for new remote module.
 * Loaded Jan list pricing for Guerlain.
 * Add button for removal to the nmi history widget.
 * Answered Zia's query about KVA registers for EA302.
 * Renamed the accrual query columns for snapshots to be C&I NMI as oppose to CCB NMI.

## March

### March 2015-03-02 -> 2015-03-08
 * Run the capacity estimates for Optus.
 * Settlement.
 * Masterlist load.
 * CCB Rec reads change the package to adhere to FRMP changes.
 * Have Redcon contract allocation work correctly for removed meters.
 * Remote principal setup for Wayne remoting.
 * Add domain and batch exceptions to the new redcommon module.
 * Change the logging advice to log these exceptions as warnings.
 * Domain class implementation for DAO and removals.
 * Get the EA302 Bill Summary from Zia.
 * Network per MWh prices and Standing rates for Nicole's budgeting.
 * Masterlist removal into the Service layer.
 * Further EA302 Capcity History for Optus NMIs. We seem to be missing alot.
 * Add a view to cisred to pick up the billed generation for Inge.
 * Change the billed network volume query to include the DuOS charges for QLD sites.

### March 2015-03-09 -> 2015-03-15
 * Settlement
 * Index out of bounds for search on Masterlist drilldown.
 * Help Natasha with the Dispute file errors (Duplicate load)
 * Nicole DuOS for QLD Networks continued.
 * New Settlement Embedded Generation for Nine Network. Connection Point NSE21R
 * Adhoc contract allocations for Inge.
 * Add more years into the Rec Extract schedule.
 * Reschedule the Network Accrual to be later in the morning.
 * Flinders Street ANZ move to Dexus.
 * Second EA302 run for non Optus NMIs.
 * Email the capacity charge players about EA302 issues.

### March 2015-03-16 -> 2015-03-22
 * Settlement
 * Masterlist Load
 * CCB Rec Extract table redefinitions and deployment.
 * LVKVATOU sites for Guerlain
 * Network per day volume extract for Gentrack Mass Market for Guerlain.
 * End date swap NMis for Ed Cheung.
 * Updated 3 customer ids to keep them consistent between test and prod.
 * Michelle and Inge CCB meter changes.
 * vw_nmi_standing performance and analysis for a contiguous dataset.
 * Support Redcon and RedX Out Of Memory errors.

### March 2015-03-23 -> 2015-03-29
 * Settlement
 * Masterlist Load
 * Run the CCB Rpt Extract through with new diff values
 * Settlement workflow diagram for Shafi.
 * Clean up Settlement Calendar check views for Mark
 * Clean up capacity check views for Mark
 * Release change logs CandI/Redcon
 * Increase the Frequency of RM17 requests
 * Settlement 2015 directories for SR files
 * Load up the new ANZ rates.
 * Australin travel.
 * Meetings with Inge and Nicole on Accruals.
 * Meetings with Guerlain and Tommy on Network Volume forecasting.

## April

### March 2015-03-30 -> 2015-04-05
 * Settlement
 * Masterlist Backload
 * Price the Network Accrual
 * CCB Generation and login changes for the Rec Extract
 * Dexus overlaps in masterlist.
 * Collapse the rec extract reads for gen and consumption into a single query.
 * Rec extract prefer nulls over zeros for unbilled sites.
 * Jam Shop Retail NMI.
 * EA302 Optus capacity values.
 * Load furtherEA302 history for Optus NMIs.
 * Tommy NMI 6407722884, NMI with incomplete data.
 * Update Guerlain on the details of the Network cost splits.
 * Change CandI to use common domain exceptions.
 * Change GWt Common to recognize domain and batch exceptions.
 * Change Redcon to use the new domain exceptions.
 * Setup the user account on a linux box for Allan Chew.

### April 2015-04-06 -> 2015-04-12
 * Settlement
 * Masterlist Backload
 * Extend the swap hhr pkg to handle reads. Need to net off generation.
 * Paperwork for Wayne along with dev notification of point releases.
 * Change vw_deamnd_ex to handle the additional ranking of reads.
 * Do a test run of the latest prelim for a case_id. Track time to process and the resulting volumes.
 * Move the build info class to common domain. Update all downstream projects to use it.
 * Release red common gwt.
 * EA302 don't generatea charge if the period doesn't match. Just estimate it.
 * Generate the capacity charges for Optus based on the Wayne aggregations.
 * Prepare EA302 doco for Allan and email him the details.
 * Refresh the capacity charges from Ausgrid now that the invoice is in.

### April 2015-04-13 -> 2015-04-19
 * Settlement
 * Masterlist Backload
 * Respon to Nicole regarding price changes for Network Accruals.
 * Look at Embedded Generation for Nine Network with Inge.
 * Change the Redcon RM17 process to fetch on basic to interval switches.
 * Update the C&I doc for capacity charge generation.
 * Setup capacity rates for Super Retail Group.
 * Update George's Masterlist Document with work priorities.
 * Generate ANZ and Railcorp charges for EA302.
 * Browse the Wayne release branch changes to check the merge was ok and that we're not releasing code we shouldn't be.
 * Load the new Vic Gov rates.
 * Blend and extend the Aspen Pharma schedule.
 * Do a full report version of the rec extract for Inge with additional standing data columns.
 * Settlement write a script to download files for loading onto test.
 * Reprice the prelim for Vicgov with the march nominated rates.
 * Adhoc charges for Devi.Request EA302 history for super retail group NMIs.
 * Dexus MRIM EA302 sites move them to CCB.
 * Do a Wayne point release for capacity charges.
 * Adhoc capacity charge generation for Devia.

### April 2015-04-20 -> 2015-04-26
 * Settlement
 * Masterlist Backload
 * Optus GT40 sites. More tariff changes.
 * Deepak notes on the Nine Network generation.
 * Summary query prior to export of demand to Snowy and Delta on new code base.
 * Optimize check views and drop those that are not performing.
 * Add a twice daily job for the profile to seepd things up on Final day.
 * Prelim C9 manual fetch (twice during the week)
 * Remove NEWEDGE Australia customer.
 * Test the error logging prior to the red-common release.
 * Cut a release of red-common and the common gwt modules.
 * Track through the Embedded Networks on the new Settlement code base for the Friday Final.
 * Compare the historic fixed amounts for the years FINALs.
 * Load the capacity history for Super retail group NMIs. Update the code to take into account historic values.
 * Update the settlement doco and diagrams for the team.
 * Look at the production aritifacts for release to see if they include any bad stale deps from the common split.
 * Redcon and CandI releases.
 * Book flights to Australia.

## May

### April 2015-04-27 -> 2015-05-03
 * Settlement
 * Masterlist
 * NMI Standing Ex. Force the sanitization of Network Tariffs in CITIPP and POWCP for Inge.
 * Run the full rec extract on test to check performance.
 * Add NMI level contiguous functions for Install Type and Network Tariff.
 * Fetch missing RM17 files for the WEEK30.
 * Add logic and tests to NMI Standing Ex for Install Type and Network Tariff.
 * Investigate the NULL handling of Embedded Network Parent / Child logic.
 * Price the Network Accruals.
 * Run the Settlement price verification reports to check that the demand we have assigned is correctly allocated after the code change.

### May 2015-05-04 -> 2015-05-10
 * Settlement
 * Masterlist
 * Optus EA302 capacity charges.
 * Look at NSW spec files for proposed Network Invoice change.
 * Adhoc capacity run for Optus for EA302.
 * Paperwork for Redcon release 03.40.
 * Email Jonathan and Inge detailing the CCB Rec Extract changes that include the standing data.
 * Run the CCB Rec Extract reporting version for Shafi and Allan.
 * Add support to the CandI masterlist service for returning billing groups.
 * Look at the QLD tariff change for Allan Chew.
 * Clean up the indexes in the wrong tables spaces due to bad config on the teamcity build server.
 * Arrange seating for trip to Melbourne.
 * Follow up the change to monthly frequency of the EA302 charges.
 * Limit the EA302 generation to sites with the tariff active in a GT site window.
 * Pkg Contiguous changes for Install Type and Nwk Tariff upto NMI level.
 * Add a UI area to the Masterlist screen for Billing Groups.
 * Additional capacity charges for Devi.
 * Add Jurisdiction to the standing data ex for Mark.
 * Create a view for NMI Standing Ex to wrap the contiguous changes.
 * Contact Michelle about the outstanding work items for the Masterlist rollout.
 * Take Jonathan and Pablo through the Billing Group changes and discuss the model for removal.

### May 2015-05-11 -> 2015-05-17
 * Settlement
 * Masterlist
 * Add billing group didn't error check correctly.
 * Filter out removed billing groups.
 * NMI addition for customer when it was previously removed.
 * Link up the UI with events for removed billing groups.
 * List pricing UI rename.
 * NMI worker check date and active checking as well.
 * Use log attribute on the new commands.
 * Shafi WEEK30 requests.
 * Generate the capacity charges for the remaining customers.
 * Email Carley and Michelle with the schedule for rollout week.
 * Upgrade the remaining users to IE11.
 * Write a reset cap value script from the diff listing check.
 * Talk to Pablo about the paging.
 * Make add customer and add NMIs scrollable.
 * Make the form spinner hide on errors.

### May 2015-05-18 -> 2015-05-24
 * Settlement
 * Masterlist
 * Rollout out of Masterlist in Melbourne with each team member.

### May 2015-05-25 -> 2015-05-31
 * Settlement
 * Work on billing group imports with Pablo.
 * Web test for finalizing a NMI.
 * Create a means of stubbing out remote services for webtests.
 * Email the CandI devs about the stub usage.
 * Explain to Simon from Snowy about the delivery of profiles.
 * Change candi finalise form for the team so it is more intuitive.
 * Remove the cap pricing job from the menu.

## June

### June 2015-06-01 -> 2015-06-07
 * Settlement.
 * Jonathan remove NMI message.
 * Optus EA302.
 * Further adhoc capacity charges Optus.
 * Change drop downs to use customer display name.
 * Change the history widget to use the customer display name.
 * Masterlist excel export using customer display name.
 * Add all search filter option for masterlist export.
 * Audit details on end date and remove accounts.
 * Change log updated for release.
 * Red assist for release.
 * Bug fix for remove/end date billing groups, multiple events firing in same session.

### June 2015-06-08 -> 2015-06-14
 * Settlement.
 * Load Emmas EA302 Tariff History for cap charges.
 * Carley and Deepak comms on basic embedded network child.
 * Check on DLF factors for Guerlian.
 * Update contig view in candi to handle winbacks.
 * CandI contiguous view check for overlaps.
 * Web Driver test for NMI removal.
 * Email Michelle about CandI reporting request.
 * Web Driver test for Add, Remove, End Date billing groups.
 * Optimistic locking chnage in CandI and associated Tests.
 * EA302 GT charges other customers.
 * Respond to Guerlains email with feedback on C&I customer novation.
 * Setup Perisher Blue customer in Redcon.
 * Change in CandI to not allow fetching of non C&I nmis via the UI.

### June 2015-06-15 -> 2015-06-21
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Work through Delta roll off buyout with Shafi.
 * [Operations CandI] Clean up the generic Retail customer in CandI and move the associated NMIs to individual entities.
 * [Operations Generic Client] WR 24219: Internet Explorer policy change to enable gif animation.
 * [Operations Redcon] Liaise with Finance on NSW retail price change.
 * [Operations Redcon] New customer Charlotte Pass wholesale rates.
 * [Operations Redcon] Bendigo Bank renewal rates change.
 * [Development Prod Released CandI 04.30.00] WR 12029: Bug with groovy comparator for CandI domain model. Was causing record selection issues.
 * [Development Prod Released  CandI 04.30.00] Candi Code cleanup delete masterlist spreadsheet parser now the UI is in prod.
 * [Operations Redcon] Update wholesale pricing contracts for block of C&I NMIs moving from EA225 to LT40.
 * [Prod and Test release CandI 04.30.00] CandI 04.30.00 release and testing.

### June 2015-06-22 -> 2015-06-28
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Network Accrual Tariff Changes. Vic C&I.
 * [Operations Redcon] Investigate the weightings for Eastern NEE23.
 * [Operations Redcon] New customer Charlotte Pass setup.
 * [Development Redcon Pkg Compile Prod Released 03.44.01] Updated functions to handle new tariff unit of measures.
 * [Operations Redcon] Load new Bendigo rates.
 * [Operations Redcon] New unit tests for accrual weightings for bad Eastern cases.
 * [Development Prod Released Redcon 03.45.00] WR 24351 Swap contract migration on standing data change.
 * [Operations CandI] Write a check view for bill group overlaps.
 * [Operations Redcon] Extend accrual prices for problem POWCP combination tariffs.
 * [Operations CandI] Email Michelle from the C&I team about upcoming masterlist work and priorities.
 * [Operations Redcon] Wholesale price changes for VicGov / Novion / ANZ
 * [Operations Redcon] Setup standing data requests for old C&I sites (Quest/Paramount)
 * [Operations Redcon] Investigate the VRSA Vic/SA interconnector and investigate if the configuration is correct.

## July

### June 2015-06-29 -> 2015-07-05
 * [Operations Redcon] Wholesale Settlement.
 * [Audit] Document file handling process with Tony.
 * [Development CandI] Correct webdriver test that failed due date parameter.
 * [Operations CandI] EA302 charges for Optus.
 * [Operations CandI] EA302 estimates for Optus.
 * [Operations Redcon] Network Accrual. Update the weighted prices for Vic C&I rates.
 * [Operations CandI] Provide Michelle a list of sites that will need GT billing groups configured.
 * [Operations Redcon] Investigate Network Invoice Plans with Pablo.
 * [Operations Redcon] Natash solar GST explanation and analysis.
 * [Operations Redcon] Network Accrual. Remove vacant consumption from volume report.
 * [Operations CandI] Help correct NMI addition dates for Emma.
 * [Operations Redcon] Network Accrual. Create check view for weightings.
 * [Operations Redcon] Extract Perisher definitions for Eric.
 * [Operations Redcon] Michelle Raptis setup.

### July 2015-07-06 -> 2015-07-12
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Provide Networks and Pricing an initial report based on the first round of NSW metering charges.
 * [Operations Redcon] Look at the standing data extract at NMIs that we are FRMP for but are not having their swap contract reported.
 * [Operations Redcon] Allocate Woolworths contract for Deepak so he can manually export data.
 * [Operations CandI] Extract list of Gentrack Billed CandI sites for Zia.
 * [Operations CandI] Raise a bulk role update of standing data for Emmas set of Optus customers.
 * [Operations Redcon] Extend the swap rates for Woolworths. We will be running that customer until the end of the year.
 * [Operations Redcon] Load the new CNRGYP metering charge codes and descriptions to get the unresolved invoice processed.
 * [Development Redcon] WR 24724: Provide Networks with a sample breakdown of the transaction level details that go into the Financial Summary.
 * [Operations Redcon] Action a retrospective Charterhall NMI switch.
 * [Operations Redcon] Load the Sydney Light Rail extension.
 * [Operations Redcon] Check all Swap rates are ready for Fridays PRELIM Settlement (Dexus CPA and Charterhall Brickworks still to be actioned).
 * [Operations Redcon] Contract updates for Allan Chew.
 * [Operations Redcon] Moved INVESTA NMIs Swaps.
 * [Operations CandI] Help Pip change the FINAL date for a couple of NMIs that she had changed incorrectly.
 * [Operations CandI] Adhoc Optus EA302 charges for Zia.
 * [Operations Redcon] Move the SRG COMMs sites to CCB.
 * [Operations Redcon] Load the new ENERGYAP metering charge codes and descriptions to get the unresolved invoice processed.

### July 2015-07-13 -> 2015-07-19
 * [Operations Redcon] Wholesale Settlement.
 * [Development Prod Released Redcon 03.47.00] Help Tommy with Redcon based tariff view for PRAT.
 * [Development Prod Released Redcon 03.47.00] WR 24724 NSW network metering charges in Financial Summary.
 * [Operations Redcon] Extend Ralicorp rates until the NMIs roll off. Reprice 201527 PRELIM.
 * [Operations CandI] 2nd round of Customers for Gentrack EA302 charges (ANZ, SRG, Railcorp, Bendigo Bank).
 * [Development CandI] Limit the read history for cap charges to a year.
 * [Operations Redcon] Setup the Charterhall Brickworks customer and move the NMIs across.
 * [Operations CandI] Clarify the storage of New Connection Consumer data with business parties in CandI.
 * [Operations CandI] Look at and approve the CandI NMI classification view for Nick N.
 * [Operations Redcon] Supply Inge with the metering charge codes loaded into Redcon for NSW networks.
 * [Operations Redcon] Load wholesale list pricing for Q3.
 * [Operations CandI] Help Christine with NMI history errors.

### July 2015-07-20 -> 2015-07-26
 * [Operations Redcon] Wholesale Settlement.
 * [Development Redcon] WR 13465 Change Network Accrual to ignore vacant consumption.
 * [Operations Redcon] Move NMI NCCCZ00548 to Brookfield large rates.
 * [Development Redcon] WR 13465 Move the Network Accrual price change logic from view into parameterized package.
 * [Operations Redcon] Update ANZ swap rates with retrospectively agreed prices.
 * [Operations Redcon] WR 25061 Answer urgent year end questions from Finance about Settlement logic.
 * [Development Prod Released Prat 01.15.00] Remove jurisdiction tariff duplicates from vw_nwk_tariff_detail.
 * [Operations Redcon] Update Informa NMI and move it onto bespoke list pricing.
 * [Operations Redcon] Move the remaining CandI COMMs NMIs that are billed in GT to CCB.
 * [Operations CandI] Help Christine with a NMI that has corrupt Dexus history.
 * [Operations Redcon] Investigate long running Network analysis query for Maria.
 * [Development CandI] Disable webtests that were timing out on occasion on the Teamcity server.
 * [Development Redcon] Check serialization between Redcon and CandI remoting calls when the Redcon API changes.
 * [Operations Redcon] Help Shafi with requesting addition RM17 (Settlement HHR data) for the latest WEEK20 and WEEK30 revisions.

### July 2015-07-27 -> 2015-08-02
 * [Operations Redcon] Wholesale Settlement.
 * [Development Prod Released Redcon 03.48.00] WR 13465 Migrate QLD Energex over to use PRAT for tariff changes.
 * [Development Prod Released Redcon 03.48.00] WR 13465 Change Network Accrual to ignore vacant consumption.
 * [Operations General] Awards week meetings.
 * [Operations CandI] Look at suggested data model changes with Mike and Pablo. Provide Feedback. Update ERD.
 * [Operations CandI] Provided updated process and hours estimate to Pricing/C&I/Development on EA302 charge generation in Gentrack.
 * [Operations Redcon] Update accrual Network rates for NSW, ACT and SA. QLD done for Energex.

## August

### August 2015-08-03 -> 2015-08-09
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Investigate the historic Delta Swap Carbon Scheme adjustment.
 * [Operations Redcon] Confirm Railcorp was correctly rolled out of the Network Accrual.
 * [Operations CandI] Look at Gentrack snapshot billing model with Pablo.
 * [Operations Redcon] Check the ENERGEXP fixed charges.
 * [Operations General] Bug fix in logging code. Corner case where first collection element was null.
 * [Operations Redcon] Financial Audit details for Network Accruals.
 * [Operations CandI] Split out DEXUS CPA in CandI. Notify Michelle.
 * [Operations CandI] Optus EA302 charges and estimates.

### August 2015-08-10 -> 2015-08-16
 * [Operations Redcon] Wholesale Settlement.
 * [Development Prod Released Redcon 03.49.00] WR 24351 Allocate COMMS contracts to Small only customers like Optus.
 * [Development Prod Released Redcon 03.50.00] WR 25430 Support QLD and SA Metering Charges.
 * [Operations Redcon] Extend the rates for Railcorp and Herontech until the sites roll off.
 * [Operations Redcon] Email Shafi with the current plan for handling dual TLF TNI sites.
 * [Operations Redcon] Discuss with Shafi the rolloff plan for the Delta Swap agreement in NSW now that the rates have expired.
 * [Operations General] Look at Marks Centos VM that is to act as the basis for our new production boxes. Provide feedback on Linux packages.
 * [Operations CandI] Generate further adhoc Optus EA302 Charges.
 * [Operations CandI] EA302 charge generation for other customers.
 * [Operations Redcon] Charterhall NMI for Allan.
 * [Development Prod Released Redcommon 02.36.00] Release Bug fix in logging code. Corner case where first collection element was null.

### August 2015-08-17 -> 2015-08-23
 * [Operations Redcon] Wholesale Settlement.
 * [Operations CandI] Generate further adhoc EA302 charges for ANZ and Super Retail Group.
 * [Operations Redcon] Notify Tommy and Ed about the swap contract allocation process and the timing of the extracts based on that.
 * [Operations Redcon] Verify ERGON metering splits in Network Financial Summary and GL code usage with Allan Chew. Provide detail extracts.
 * [Operations Redcon] Verify UMPLP customer counts in Network Financial Summary with Maria Korotich.
 * [Development CandI] WR 11037: Wire up the Wayne HTTP client in CandI.
 * [Development CandI] WR 11037: Migrate off the historical AppDate classes to Java 8 time API.
 * [Development CandI] WR 11037: Add search filters for CandI Masterlist repo to allow quick recognition of EA302 sites.

### August 2015-08-24 -> 2015-08-30
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Manage the Delta Rolloff and switch NSW mass market wholesale contracts back to Snowy pricing.
 * [Development Redcon] WR 13465: Wire up the accrual rate price change checks to PRAT.
 * [Development Redcon] WR 13465: Migrate Ergon price change for Network Accruals over to use PRAT.
 * [Development Prod Released CandI 04.34.00] WR 11037: Wire up capacity process to reference the Masterlist cache for picking up EA302 sites.
 * [Development Prod Released CandI 04.34.00] WR 11037: Remove references to the Redcon domain from the CandI capacity process.
 * [Development Prod Released CandI 04.34.00] WR 11037: Add first run of estimation code and db config to CandI for cap charge handover.
 * [Operations General] Clean up 3 check views that were firing.
 * [Operations General] Estimate work and tasks required for Shafi's Settlement screens.

## September

### August 2015-08-31 -> 2015-09-06
 * [Operations Redcon] Wholesale Settlement.
 * [Development Redcon] WR 13465: Network Accrual selection criteria change, prefer last remitted date over a loss or an inactive NMI.
 * [Development Redcon] WR 13465: Automate the cleansing of UNKNOWN tariff codes in priced accrual volume.
 * [Development Redcon] WR 25858: Change the GL groupings for Finance in the Network Financial Summary.
 * [Operations CandI] Help Christine from C&I with a bad customer addition.
 * [Operations CandI] Clean up EA302 related check view that was firing for cap value diffs between us and the Networks.
 * [Development CandI] General: Clean up unused RedX deps in CandI.
 * [Development CandI] General: Reenable the billing group related webtests in CandI using the improved web driver navigation logic.
 * [Development Redcon] General: Clean up old unused Settlement db objects for next release.
 * [Operations Redcon] Work through the cleanup of a duplicate 201505 WEEK30 Wholesale Settlement revision from AEMO.
 * [Operations CandI] Generate EA302 charges for Optus.
 * [Operations Redcon] Close all swap contracts for Railcorp NMIs that we are no longer FRMP for.
 * [Development Redcon] General: Try index compression on swap_nmi_hhr_kwh_ex on REDCON_T.

### September 2015-09-07 -> 2015-09-13
 * [Operations Redcon] Wholesale Settlement.
 * [Development Prod Released CandI 04.35.00] WR 11037: Optimize EA302 Charge Generation read the complete set of vals as oppose to per NMI fetch.
 * [Development Prod Released CandI 04.35.00] WR 11037: Safe guard Wayne calls to allow graceful exit when Wayne is down.
 * [Development Prod Released CandI 04.35.00] WR 11037: Wire up EA302 charge generation to new GWT screen.
 * [Development Prod Released CandI 04.35.00] WR 11037: Integration Tests covering remote Wayne/Redcon boundaries for EA302 generation.
 * [Development Prod Released RedCommon 02.37.00] Red Common released as core apps had dependencies on unreleased code.
 * [Development Prod Released Redcon 03.50.00] WR 25858: Change the GL groupings for Finance in the Network Financial Summary.
 * [Development Prod Released Redcon 03.51.01] WR 25952: Urgent Delta Rolloff revision handling.
 * [Operations CandI] New Nine Network related customer setup.
 * [Operations CandI] Missing estimates for Optus NMIs after price change.
 * [Operations CandI] Michelle urgent NMI addition for Dexus billing.
 * [Operations CandI] Help Christine with the NMIs she incorrectly added to ANZ instead of Dexus.
 * [Operations Redcon] Help Shafi with interval read extract query from Redcon.

### September 2015-09-14 -> 2015-09-20
 * [Operations Redcon] Wholesale Settlement.
 * [Development Prod Released Redcon 03.52.02] WR 25952: Small change to HHR supporting data for Delta invoice.
 * [Development Prod Released CandI 04.36.00] WR 11037: Change EA302 charge generation to be form based.
 * [Development Prod Released CandI 04.36.00] WR 11037: Update logging for cases where price changes are not supported.
 * [Development Prod Released CandI 04.36.00] WR 11037: Check for invalid customer assignment for NMIs on charge generation.
 * [Operations Redcon] Work through abolished NMIs with Shafi.
 * [Operations CandI] Help Janette with retrospective NMI updates for ANZ sites.
 * [Operations Redcon] Adhoc request from Martin to provide SA swap details.
 * [Operations Redcon] Rollback 2015 list pricing to the start of the year.
 * [Operations Redcon] Reprice the PRELIM with extended rates for Railcorp and Heron Tech.
 * [Operations CandI] New Gentrack based EA302 site for Sydney Light Rail.
 * [Operations CandI] Additional EA302 history required for Optus sites.
 * [Operations CandI] Generate the remaining EA302 charges for the non Optus customers.

### September 2015-09-21 -> 2015-09-27
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] WR 26248: AIX migration performance investigation. Network invoice linking.
 * [Operations Redcon] Generate United Financial Summary for Maria due to additional system load.
 * [Operations Redcon] Explain historic QLD swap setup to pricing.
 * [Operations Redcon] Explain historic United swap setup to Tommy.
 * [Operations Redcon] Cut release of gwt-common lib 00.20 release.
 * [Operations Redcon] Enable swap allocation after AIX migration.
 * [Development Redcon] Change the CCB Rec Extract handling to ignore QLD Jurisdiction level charges.
 * [Development Redcon] Change the read selection criteria in Settlement processing to correctly handle vacant consumption.
 * [Development Redcon] WR 24351: Initial FRMP allocator should wait for full metering config before assigning a contract.
 * [Operations CandI] Discuss Gentrack NMI bill group setup and VicGov MRIM bill groups.
 * [Operations CandI] Help Pablo correct Railcorp NMI history for billing.
 * [Operations Redcon] Assign swaps contracts for Embedded Network sites without a Network.

## October (Support)

### September 2015-09-28 -> 2015-10-04
 * [Operations Redcon] Wholesale Settlement
 * [Operations Redcon] WR 26248 AIX Migration Performance Investigations.
 * [Development Prod Released Redcon 03.53.00] WR 26248 AIX Network Invoice Linking change to improve performance.
 * [Operations Redcon] Get the PRELIM Settlement loaded for month end processing.
 * [Operations Redcon] Review Kamal's MIRN movement SQL for reporting.
 * [Operations Redcon] Move NMIs from Michelle to wholesale list pricing.
 * [Operations General] Support, unresolved files and check views.
 * [Development Prod Released CandI 04.37.00] Warning support for EA302 charge generation screen.
 * [Operations CandI] Help Janete correct a NMI.
 * [Operations CandI] EA302 charge generation for Optus.

### October 2015-10-05 -> 2015-10-11
 * [Operations Redcon] Wholesale Settlement
 * [Operations General Support] Check Views and Unresolved files.
 * [Operations CandI] Janete, help clean up incorrect customer.
 * [Operations CandI] Zia, help setup default billing groups for Gentrack extract.
 * [Operations Redcon] Michelle and Christine. Flag some MRIM sites as CCB NMIs in Redcon for read extract.
 * [Operations Redcon] Nicole Behar, Extract Network Accrual for finance and price/weight a couple of additional network tariffs.
 * [Operations Redcon] Allan Chew, Help with a query to check for demand tariffs in Gentrack.
 * [Operations Redcon] Zia, Continue working on a report for to check sites without billing groups setup.
 * [Operations Redcon] Shafi, Work through the missing excluded forecast for historic prelim Gas Settlement.
 * [Operations Prat] Help Tommy add a demand tariff flag to PRAT model.
 * [Operations CandI] Generate the EA302 capacity charges for Optus.
 * [Operations CandI] Investigate CandI Gentrack related billing exceptions. (Bill extract range change, missing payments exception)

### October 2015-10-12 -> 2015-10-18
 * [Operations Redcon] Wholesale Settlement
 * [Operations General Support] Check Views and Unresolved files.
 * [Operations General Support] VicGov SME Rollon.
 * [Operations General Support] Poor check view performance. Gather stats and try to improve the checks.
 * [Operations Redcon] New rates for ANZ and Vicgov wholesale.
 * [Operations Redcon] Incident report for REDCON_P outage.
 * [Operations Redcon] CANDI_T database outage. Work with IBM to bring it back after Flexclone refresh.
 * [Operations CandI] Gentrack billing period update. Investigation of period changes.

### October 2015-10-19 -> 2015-10-25
 * [Operations Redcon] Wholesale Settlement
 * [Operations General Support] Check Views and Unresolved files.
 * [Operations General Support] VicGov SME Rollon.
 * [Operations Redcon] WR 26248 AIX migration performance investigation. Check view runtimes. 
 * [Operations CCB] WR 26248 Derivation plans.
 * [Development Prod Released Redcon 03.54.00] WR 26717 Cannot determine AEMO MIRN Status for GRMBS MIRN Status[UNKNOWN].
 * [Operations General] Missing Wayne/Redcon files posted into RedX.
 * [Operations General Support] Allan Chew query for non C&I demand tariffs in Gentrack.
 
### October 2015-10-26 -> 2015-10-31
 * [Operations Redcon] Wholesale Settlement
 * [Operations General Support] Check Views and Unresolved files.
 * [Operations General Support] VicGov SME Rollon.
 * [Operations Redcon] WR 26248 AIX migration performance investigation. Check view runtimes. 
 * [Operations CCB] WR 26248 Derivation plans.
 * [Operations Redcon] Support Hepburn Gen Invoice code change.
 * [Operations Redcon] Support Network Invoice disputes screen. Select all items by default.

## November 2015

### November 2015-11-02 -> 2015-11-08
 * [Operations Redcon] Wholesale Settlement.
 * [Operations CCB] WR 26248 Adhoc CCB Rec Extract and rewrite for execution under AIX.
 * [Operations CandI/Redcon] Large batch of mass market NMIs associated with C&I and sorting their contract allocation.
 * [Operations General] RedX missing files from Wayne after weekend outages.
 * [Operations Redcon] Price month end Network Accrual.
 * [Operations Redcon] Wests Group new customer and rates. Move customers over from Panthers group.
 * [Operations CandI] Optus EA302 Charges.
 * [Operations CandI] NMI movements for Christine/Janete for Dexus sites going to CCB.
 * [Development Prod Released Redcon 03.56.00] Select all disputes by default in Network Invoice Screen.
 * [Development Prod Released Redcon 03.56.00] Billing system config override for VICGOV SME rollon.
 * [Operations Redcon] Load rates for VicGov SME.
 * [Operations CandI] Switch report for VicGov transfers.
 * [Operations Redcon] Snowy queries about Railcorp volume rolloff.
 * [Operations Redcon] Request additional RM17s for WEEK20/WEEK30 wholesale settlement.
 * [Operations Redcon] WR 26945: Redcon config change the ERGON participant for historic and future Network communication.
 * [Operations Redcon] Update NMI Discovery query for Guerlain with nmi_classification.

### November 2015-11-09 -> 2015-11-15
 * [Operations Redcon] Wholesale Settlement.
 * [Operations CCB] WR 26248 Adhoc CCB Rec Extract and rewrite for execution under AIX.
 * [Development Redcon] Bug fix to base settlement view for rare duplicate settlement scenario.
 * [Development Redcon] WR 13465 Network Accrual price and snapshot volume at end of batch.
 * [Operations Redcon] REDCON_P production outage and db restore.
 * [Operations Redcon] Load Wontaggi Elderly rates.
 * [Operations CandI] VicGov SME transfer reports.
 * [Operations CandI] EA302 charges for non Optus customers.
 
### November 2015-11-16 -> 2015-11-22
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Gatekeeper] Production outage. Issues with RedX proxy and Gatekeeper in bad state.
 * [Development Redcon] WR 13465. Write the 2 network accrual reports to the file system after month end processing.
 * [Operations Redcon] Initiate meeting with service delivery on getting further shared mounts on new RHEL 7.1 machines.
 * [Operations Redcon] Work with interested parties to get the CCB Rec Extract rescheduled to run as it did pre AIX.
 * [Operations Redcon] Incident report for REDCON_P outage.
 * [Operations CandI] Adhoc capacity charge generation for Zia.
 * [Operations CandI] Help Matthew bulk close RAILCORP NMIs.
 * [Operations General] Organize meetings with Finance for week of visit.

### November 2015-11-23 -> 2015-11-29 (Partial Week 1 Day Leave)
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Gather job times on new platform.
 * [Operations CandI] Various NMI moves from GT to CCB due to new demand tariffs. (Janette, Kirsten, Michelle)
 * [Development Common] WR 25758 NMI validation widget for common GWT use.
 * [Development Prod Released Redcon 03.57.00] WR 13465. Write the 2 network accrual reports to the file system after month end processing.
 * [Operations Redcon] Clean up Paul's checkin and detailed email about best practises.
 * [Development Redcon] WR 25758 Settlement Screens for Operations Processing

## December 2015

### November 2015-11-30 -> 2015-12-06 (Partial Week 2 Days Leave)
 * [Operations Redcon] Wholesale Settlement.
 * [Operations General] Many Meetings in Melb Office
 * [Operations CandI] EA302 History for Optus NMIs.
 * [Operations General] Check view fixes.
 * [Operations General] Organize new mount structure for common shares mounted on Linux boxes.
 * [Operations CandI] Prepare point release for Novion rename in consolidated billing.
 * [Operations Red Router] MIBB Password change. 

### December 2015-12-07 -> 2015-12-13
 * [Operations Redcon] Wholesale Settlement. We have multiple Special revisions for this week.
 * [Operations CandI] Optus historical EA302 tariff changes and rebill.
 * [Operations CandI] EA302 other customers.
 * [Operations Redcon] Follow up pricing to get missing wholesale rates for the new year.
 * [Development Redcon] WR 25758 Settlement Screens for Operations Processing
 * [Development General] Move common useful GWT widgets to shared lib.
 * [Operations Redcon] Load Q4 List Pricing.
 * [Operations CandI] Novion -> Vicinity NMI changes for Janete.
 * [Operations CandI] List contract addition for new customer Yuhu.
 * [Operations Redcon] Work out christmas and new year cover for accruals with Nicole.
 * [Operations Redcon] Setup long term list pricing for QLD C&I sites.
 * [Operations Redcon] Help Snowy support with compression problem on retail data extract.
 * [Operations General] Document up the new NFS mount process for the dev team and collect any new mounts that are required.
 
### December 2015-12-14 -> 2015-12-20
 * [Operations Redcon] Wholesale Settlement. 
 * [Operations General] Shane/Sanjesh test DB server config.
 * [Operations General] WR 27783 Paperwork for prod app server mounts.
 * [Operations CCB] Schedule the rec extract for Inge so it is no longer adhoc.
 * [Operations Redcon] Configure remote settlement processing for cover while on leave.
 * [Operations Redcon] Help Tommy with contract allocation for a couple of Bendigo NMIs.
 * [Operations Redcon] WR 27749 Investigate Mikes result set issue. Recommend moving to Tomcat datasource.
 * [Operations Redcon] Load retail swap rates for 2016.
 * [Operations CandI] Follow up on work request for Hunter Region changes requested for the new year.
  
### December 2015-12-21 -> 2015-12-27 (Leave)
 * [Operations Redcon] Wholesale Settlement. 

### December 2015-12-28 -> 2016-01-03 (Leave)
 * [Operations Redcon] Wholesale Settlement.

# January 2016

## January 2016-01-04 -> 2016-01-10
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Half year end push for outstanding swap rates and the 201601 prelim.
 * [Operations Redcon] Urgent point release for special revision handling in Delta wholesale roll off.
 * [Operations Redcon] Correct embedded network parent/child overlap. Would cause downstream issues.
 * [Operations CCB/Redcon] Halt over night rec extract while the CCB derivation process continues to perform badly.
 * [Development Redcon] WR 25758 Settlement Screens for Operations Processing.
 * [Operations CandI] Look into clock skew exceptions causing errors for application single sign on.
 * [Architecture CandI] Propose a change to ER model for cross system billing groups.
 * [Operations CandI] Externalize date parametrisation for cap charge generation. Makes the tests less brittle.
 
## January 2016-01-11 -> 2016-01-17
 * [Operations Redcon] Wholesale Settlement.
 * [Operations Redcon] Half year end push for outstanding swap rates and the 201601/201602 prelim.
 * [Development Redcon Prod Released 03.60.00] WR 25758 Initial update swap contract screen released.
 * [Development General] GWT Common Releases (This is a shared widget lib).
 * [Operations General] Move the creation of shares forward for the new app servers.
 * [Operations General] Clean up check views that were firing.
 * [Operations General] Estimates/reports for existing and upcoming tickets.
 * [Operations General] Try and work through FTP setup with PW so he could deliver solar extracts to Snowy.
 * [Operations CandI] Second round of EA302 non Optus customers.

## January 2016-01-18 -> 2016-01-24
 * [Operations Redcon] Wholesale Settlement * 2.
 * [Operations Redcon] Support: Expiring swaps, check views, support catch up with Kamal.
 * [Operations Redcon] C&I Network cost extract for Amy from Finance.
 * [Operations Redcon] Help PW deliver files to Snowy via Google Drive.
 * [Operations Redcon] Detail email to pricing explaining current state of 2016 swap, what is missing etc.
 * [Operations General] Feedback on KPIs. 
 * [Development Redcon Prod] WR 25758 Second screen to allow reprice of Settlement volume.

## January 2016-01-25 -> 2016-01-31
 * [Operations Redcon] Wholesale Settlement
 * [Operations Redcon] Network Accrual price change for Vic.
 * [Operations Redcon] Load Snowy Hydro custom swap rates.
 * [Operations Redcon] Updating incorrect SA and QLD swap rates.
 * [Operations Redcon] Redcon 03.61 release.
 * [Operations General] Reply to Dean with Database backup findings.
 * [Operations General] Give Vin the Teamcity build statistics for the last week since his DB change.
 * [Development Redcon Released Redcon 03.61.00] WR 25758 Second screen to allow reprice of Settlement volume.
 * [Development GWT Common Released] General widget lib released.
 * [Operations CandI] Informa move to list pricing.
 * [Operations CandI] New customer Asso on List Pricing.

# Feb 2016

## Feb 2016-02-01 -> 2016-02-07
 * [Operations Redcon] Wholesale Settlement.
 * [Development Redcon Released Redcon 03.62.00] WR 25758 Third screen to allow request of RM17s. Documentation in confluence.
 * [Architecture Redcon] Look at data sets supplied by the AEMO MMS system and see which would be useful for Settlement.
 * [Operations General] Explain to Zia what the process should be for Mirvac customers being given Investa rates.
 * [Operations General] Help fixup the redccb build on Teamcity.
 * [Operations General] Cleanup unused data on Snowy FTP server.
 * [Operations General] Generate settlement invoice delivery folders through until 2020.
 * [Operations CandI] Optus EA302 run.
 * [Operations General] Respond to business about Hunter Valley EA302 charges.
 * [Development GWT Common Released] Common form code moved into shared lib.
 
## Feb 2016-02-08 -> 2016-02-14

### Summary Previous Week

The bulk of my time was spent working on a Network Budget for Finance. I also had 2 CCB issues
to look at: Trying another performance approach for the CCB Rec Extract and looking at the CCB 
read export for Embedded Network children.

### Plan This Week

My main task this week will be meeting the integration team to take over John's work. I will 
also be working through EA302 billing in the Hunter region with business.

### Detail
 * [Operations Redcon] Wholesale Settlement.
 * [Operations WR 28461] Help Finance out with Network Budget.
 * [Operations Redcon] Q1 List Pricing swap rates loaded. 351 George Street swap rates loaded.
 * [Operations Redcon] CCB Rec Extract performance issues on AIX. Adhoc run for Inge.
 * [Operations WR 28924] Change CCB read export to handle a special subset of Embedded Network children.
 * [Operations CandI] Second round of EA302 charges for non Optus.
 * [Operations Linux WR 27783] Following up on permissions issue for new file system shares.
 * [Architecture EA302 Demand Tariffs] Document short term options for EA302 support in Hunter region.
 
## Feb 2016-02-15 -> 2016-02-21

### Summary Previous Week

I was in Australia last week at both the Lumo and Red offices. My time was split between:

 * Meetings about, and documenting up the migration of Lumo electricity data into Redcon.
 * Meetings about demand billing in Wayne.
 * Handover of Settlement screens to Shafi.

### Plan This Week

I'm going to spend the bulk of this week documenting up a plan to implement demand tariffs in Wayne. This is a large complex process so will require some planning.

### Detail

 * [Operations Redcon] Wholesale Settlement (This is next to nothing now just fetching and loading a couple of files).
 * [Operations Linux WR 27783] Following up on permissions issue for new file system shares.
 * [Architecture EA302 Demand Tariffs] Meetings and planning for demand solution.
 * [Architecture Lumo Electricity Migration] Meetings and documentation about migrating Lumo's electricity data into Redcon.
